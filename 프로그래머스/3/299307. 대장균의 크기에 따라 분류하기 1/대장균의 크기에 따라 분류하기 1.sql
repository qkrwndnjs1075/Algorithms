SELECT
    ID,
    CASE
        WHEN SIZE_OF_COLONY <= 100 THEN 'LOW'
        WHEN SIZE_OF_COLONY <= 1000 THEN 'MEDIUM' -- 100 초과, 1000 이하
        ELSE 'HIGH'                               -- 1000 초과
    END AS SIZE
FROM
    ECOLI_DATA
ORDER BY
    ID ASC;