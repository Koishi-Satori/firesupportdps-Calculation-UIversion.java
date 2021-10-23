class totalCalculation_mk153 {
    public int[] DefenceBreak(int force, int DefenceBreak, int miss, int accuracy, int damage, int amount) {
        int[] result = new int[5];
        int i = 1;
        int j = 0;
        int total_tryShot = 0;
        int hit_tryShot = 0;
        int CurForce = force;
        double skill_extraDamage = 0;
        int skill_defTimes = 0;
        int skill_addedDamageTimes = 0;
        double curMiss = miss;
        if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random()) {
            curMiss /= 0.8;
            total_tryShot++;
            hit_tryShot++;
            skill_defTimes++;
        } else total_tryShot++;
        if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random()) {
            i++;
            j++;
            CurForce -= DefenceBreak;
            skill_extraDamage = damage;
        } else i++;
        for (CurForce = CurForce - 0; CurForce > 0; i++) {
            if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random()) {
                if (skill_defTimes <= 3) {
                    curMiss /= 0.8;
                }
                total_tryShot++;
                hit_tryShot++;
                skill_defTimes++;
            } else total_tryShot++;
            if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random()) {
                j++;
                skill_addedDamageTimes++;
            }
        }
        int a = (int) Math.ceil(skill_extraDamage + (skill_addedDamageTimes * 0.15 * damage * amount));
        result[0] = i - 1;
        result[1] = j;
        result[2] = total_tryShot;
        result[3] = hit_tryShot;
        result[4] = a;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, int accuracy, int miss, int amount, int Times_onBreak, int DefenceBreak, int extraDamage, int hit_tryShot) {
        double totalEcptBreak = 0;
        double curMiss = miss;
        int skill_defTimes = 0;
        for (int i = 1; i <= 5000; i++) {
            if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random()) {
                if (skill_defTimes <= 2) {
                    skill_defTimes++;
                    curMiss /= 0.8;
                } else {
                    curMiss *= 1.25;
                    skill_defTimes--;
                }
                totalEcptBreak = totalEcptBreak + (double) damage;
            }
            if (Math.max(0.4, (double) (accuracy) / (curMiss * 8 + accuracy)) >= Math.random())
                totalEcptBreak = totalEcptBreak + (damage + 0.1 * DefenceBreak) * amount;
        }
        totalEcptBreak = totalEcptBreak + (double) extraDamage + (double) (hit_tryShot * damage) + (double) (Times_onBreak * amount * damage);
        return totalEcptBreak;
    }
}
