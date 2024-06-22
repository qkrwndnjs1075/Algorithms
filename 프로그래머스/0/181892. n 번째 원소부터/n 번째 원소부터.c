#include <stdio.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int* solution(int num_list[], size_t num_list_len, int n) {
    // n번째 원소부터 마지막 원소까지의 길이를 계산합니다.
    size_t result_len = num_list_len - (n - 1);
    
    // result_len개의 요소를 담을 배열을 동적 할당합니다.
    int* answer = (int*)malloc(result_len * sizeof(int));
    
    // 동적 할당이 실패했는지 확인합니다.
    if (answer == NULL) {
        return NULL; // 메모리 할당 실패 시 NULL 반환
    }
    
    // n번째 원소부터 마지막 원소까지 answer 배열에 복사합니다.
    for (size_t i = 0; i < result_len; i++) {
        answer[i] = num_list[n - 1 + i];
    }
    
    return answer;
}

int main() {
    // 첫 번째 예제
    int num_list1[] = {2, 1, 6};
    size_t num_list_len1 = 3;
    int n1 = 3;
    
    int* result1 = solution(num_list1, num_list_len1, n1);
    if (result1 != NULL) {
        for (size_t i = 0; i < num_list_len1 - (n1 - 1); i++) {
            printf("%d ", result1[i]);
        }
        free(result1); // 동적 할당된 메모리를 해제합니다.
        printf("\n");
    } else {
        printf("Memory allocation failed\n");
    }
    
    // 두 번째 예제
    int num_list2[] = {5, 2, 1, 7, 5};
    size_t num_list_len2 = 5;
    int n2 = 2;
    
    int* result2 = solution(num_list2, num_list_len2, n2);
    if (result2 != NULL) {
        for (size_t i = 0; i < num_list_len2 - (n2 - 1); i++) {
            printf("%d ", result2[i]);
        }
        free(result2); // 동적 할당된 메모리를 해제합니다.
        printf("\n");
    } else {
        printf("Memory allocation failed\n");
    }
    
    return 0;
}
