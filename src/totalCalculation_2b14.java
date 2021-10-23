class totalCalculation_2b14 {
    public int[] DefenceBreak(int force, int DefenceBreak, double MissDef) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        for (int CurForce = force; CurForce > 0; i++) {
            if (Math.max(0.4, MissDef) >= Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, double MissDef, int amount, int Times_onBreak, double shotspeed) {
        double totalExceptBreak = 0;
        int timesSkill_2 = 0;

        for (double timeTrigger = 0; timeTrigger <= (4999 * shotspeed); timeTrigger += 10) {
            if (Math.max(0.4, MissDef) >= Math.random()) timesSkill_2++;
        }

        for (int i = 1; i <= 5000; i++) {
            if (Math.max(0.4, MissDef) >= Math.random()) totalExceptBreak = totalExceptBreak + damage * amount * 1.25;
        }

        totalExceptBreak = totalExceptBreak + (timesSkill_2 * 1.8 * damage * 1.25 * amount) + (double) (Times_onBreak * amount * damage);
        return totalExceptBreak;
    }
}
