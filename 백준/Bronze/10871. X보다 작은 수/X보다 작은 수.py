# 입력 받기
N, X = map(int, input().split())
A = list(map(int, input().split()))

# X보다 작은 수 필터링
result = [num for num in A if num < X]

# 결과 출력
print(" ".join(map(str, result)))