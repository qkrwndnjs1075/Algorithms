SELECT
    FP.CATEGORY,
    FP.PRICE AS MAX_PRICE,
    FP.PRODUCT_NAME
FROM
    FOOD_PRODUCT FP
WHERE
    FP.CATEGORY IN ('과자', '국', '김치', '식용유')
    AND FP.PRICE IN (
        -- 각 CATEGORY별 최대 가격을 찾는 서브쿼리
        SELECT
            MAX(PRICE)
        FROM
            FOOD_PRODUCT
        WHERE
            CATEGORY IN ('과자', '국', '김치', '식용유') -- 메인 쿼리와 동일한 필터링
        GROUP BY
            CATEGORY
    )
ORDER BY
    MAX_PRICE DESC;