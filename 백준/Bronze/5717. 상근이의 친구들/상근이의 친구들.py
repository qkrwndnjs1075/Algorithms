while True:
    # 한 줄 입력을 받아 공백으로 분리 후 정수로 변환
    M, F = map(int, input().split())
    
    # M과 F가 모두 0이면 반복 종료
    if M == 0 and F == 0:
        break
        
    # 친구 수 계산 및 출력
    print(M + F)