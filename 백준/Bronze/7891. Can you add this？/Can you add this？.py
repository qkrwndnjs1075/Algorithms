# 테스트 케이스의 수를 입력받음
t = int(input())

# 각 테스트 케이스를 처리하기 위한 반복문
for _ in range(t):
    # 한 줄에 공백으로 구분된 두 정수를 읽고 합을 계산
    x, y = map(int, input().split())  # 입력받은 문자열을 정수로 변환 후 x, y에 저장
    print(x + y)  # 두 수의 합을 출력