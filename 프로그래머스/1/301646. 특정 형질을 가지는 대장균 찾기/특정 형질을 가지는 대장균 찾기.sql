SELECT
    COUNT(ID) AS COUNT
FROM
    ECOLI_DATA
WHERE
    -- 2번 형질(값 2)을 보유하지 않음: 해당 비트가 0
    (GENOTYPE & 2) = 0
    AND
    -- 1번 형질(값 1) 또는 3번 형질(값 4)을 보유함: 1과 4의 OR 값(5)과 AND 연산 결과가 0보다 큼
    (GENOTYPE & 5) > 0;