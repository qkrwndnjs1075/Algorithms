# 5개의 점수를 입력받아 총점을 계산하는 프로그램

# 점수를 저장할 리스트 초기화
scores = []

# 5번 반복하여 점수를 입력받음
for i in range(5):
    score = int(input())
    scores.append(score)

# 총점 계산
total_score = sum(scores)

# 총점 출력
print(total_score)