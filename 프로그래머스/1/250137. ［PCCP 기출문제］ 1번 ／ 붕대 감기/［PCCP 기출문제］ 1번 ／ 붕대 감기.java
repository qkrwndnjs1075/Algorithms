class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int bandageTime = bandage[0];
        int recoveryPerSec = bandage[1];
        int bonusRecovery = bandage[2];

        int currentHealth = health;
        int maxHealth = health;
        int comboCount = 0;
        int attackIndex = 0;

        int lastAttackTime = attacks[attacks.length - 1][0];

        for (int time = 1; time <= lastAttackTime; time++) {
            // 몬스터 공격 여부 확인
            if (attackIndex < attacks.length && time == attacks[attackIndex][0]) {
                int damage = attacks[attackIndex][1];
                currentHealth -= damage;
                comboCount = 0;
                attackIndex++;

                // 캐릭터 사망 여부 확인
                if (currentHealth <= 0) {
                    return -1;
                }
            } else {
                // 체력 회복
                currentHealth += recoveryPerSec;
                comboCount++;

                // 연속 성공 보너스
                if (comboCount == bandageTime) {
                    currentHealth += bonusRecovery;
                    comboCount = 0;
                }

                // 최대 체력 제한
                if (currentHealth > maxHealth) {
                    currentHealth = maxHealth;
                }
            }
        }

        return currentHealth;
    }
}