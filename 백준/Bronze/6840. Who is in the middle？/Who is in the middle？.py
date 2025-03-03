# 세 개의 무게를 입력받기
weights = []
for _ in range(3):
    weight = int(input())
    weights.append(weight)

# 무게를 정렬하기
weights.sort()

# 중간 무게(엄마 곰의 그릇 무게) 출력
print(weights[1])
