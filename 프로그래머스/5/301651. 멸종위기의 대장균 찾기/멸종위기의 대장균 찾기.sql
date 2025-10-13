WITH RECURSIVE Generation_CTE AS (
    -- 앵커 멤버 (Anchor Member): 1세대 (ROOT 개체)
    SELECT
        ID,
        PARENT_ID,
        1 AS GENERATION
    FROM
        ECOLI_DATA
    WHERE
        PARENT_ID IS NULL

    UNION ALL

    -- 재귀 멤버 (Recursive Member): 다음 세대
    SELECT
        E.ID,
        E.PARENT_ID,
        G.GENERATION + 1
    FROM
        ECOLI_DATA E
    INNER JOIN
        Generation_CTE G ON E.PARENT_ID = G.ID
),
No_Child_CTE AS (
    -- 자식이 있는 개체 ID 목록
    SELECT DISTINCT
        PARENT_ID
    FROM
        ECOLI_DATA
    WHERE
        PARENT_ID IS NOT NULL
)
SELECT
    COUNT(G.ID) AS COUNT,
    G.GENERATION
FROM
    Generation_CTE G
LEFT JOIN
    No_Child_CTE N ON G.ID = N.PARENT_ID
WHERE
    -- LEFT JOIN 결과 PARENT_ID가 NULL인 경우, 즉 자식이 없는 개체
    N.PARENT_ID IS NULL
GROUP BY
    G.GENERATION
ORDER BY
    G.GENERATION ASC;