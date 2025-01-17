# 입력 받기
n1, k1, n2, k2 = map(int, input().split())

# 전체 좌석 수 계산
total_seats = (n1 * k1) + (n2 * k2)

# 결과 출력
print(total_seats)