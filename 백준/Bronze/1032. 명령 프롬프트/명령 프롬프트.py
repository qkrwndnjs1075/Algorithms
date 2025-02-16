n = int(input())
files = [input().strip() for _ in range(n)]

pattern = list(files[0])  # 첫 번째 파일명을 리스트로 변환하여 패턴으로 사용

for i in range(len(files[0])):  # 각 문자의 위치에 대해 확인
    for j in range(1, n):  # 두 번째 파일부터 비교
        if files[j][i] != pattern[i]:  # 문자가 다르면 ?로 대체
            pattern[i] = "?"
            break  # 이미 ?로 변경했으므로 더 확인할 필요 없음

print("".join(pattern))  # 리스트를 문자열로 변환하여 출력
