SELECT
    DATETIME AS 시간
FROM
    ANIMAL_INS
ORDER BY
    DATETIME ASC -- 시간을 오름차순 정렬
LIMIT 1; -- 가장 이른 시간의 레코드 1개만 선택