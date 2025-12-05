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
        
        for(int i = 1; i <= lastAttackTime; i++){
            
            if(attackIndex < attacks.length && i == attacks[attackIndex][0]){
                
                int damage = attacks[attackIndex][1];
                currentHealth -= damage;
                comboCount = 0;
                
                attackIndex++;
                
                if(currentHealth <= 0) {
                    return -1;
                }
                
            } else {
                currentHealth += recoveryPerSec;
                comboCount++;
                
                if(comboCount == bandageTime) {
                    currentHealth += bonusRecovery;
                    comboCount = 0;
                }
                
                if(currentHealth > maxHealth) {
                    currentHealth = maxHealth;
                }
            }
        }
        
        return currentHealth;
    } 
}