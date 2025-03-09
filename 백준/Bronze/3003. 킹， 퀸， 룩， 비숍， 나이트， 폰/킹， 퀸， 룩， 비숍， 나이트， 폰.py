# 올바른 체스 피스 개수
correct_pieces = [1, 1, 2, 2, 2, 8]  # 킹, 퀸, 룩, 비숍, 나이트, 폰

# 입력 받기
found_pieces = list(map(int, input().split()))

# 필요한 피스 수 계산
result = []
for i in range(6):
    diff = correct_pieces[i] - found_pieces[i]
    result.append(diff)

# 결과 출력
print(*result)