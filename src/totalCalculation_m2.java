class totalCalculation_m2 {
    public int def_force_E(int force) {
        if (force > 0) return 1;
        else return 0;
    }

    public int[] DefenceBreak(int force, int DefenceBreak, int accuracy, int miss) {
        int[] result = new int[2];
        int i = 1;
        int j = 0;
        double tmp_accuracy = accuracy;

        for (int CurForce = force; CurForce > 0; i++) {
            if (i == 1) tmp_accuracy *= 1.1;
            else if (i == 2) tmp_accuracy *= 1.1;
            else if (i == 3) tmp_accuracy *= 1.1;
            else continue;
            double MissDef = (tmp_accuracy / (tmp_accuracy + 8 * miss));
            if (Math.max(0.4, MissDef) >= Math.random()) {
                CurForce -= DefenceBreak;
                j++;
            }
        }
        result[0] = i - 1;
        result[1] = j;
        return result;
    }

    public double AttackDamage_afterBreak(int damage, int DefenceBreak, double accuracy, int Times_onBreak, int amount, int def_force_E, int miss) {
        double totalEcptBreak = 0;
        double MissDef, damage_skill, tmp_accuracy;
        tmp_accuracy = accuracy;
        damage_skill = (double) damage * 1.2;
        switch (def_force_E) {
            case 0 -> {
                for (int i = 1; i <= 5000; i++) {
                    if (i == 1) tmp_accuracy *= 1.1;
                    else if (i == 2) tmp_accuracy *= 1.1;
                    else if (i == 3) tmp_accuracy *= 1.1;
                    else continue;
                    MissDef = (tmp_accuracy / (tmp_accuracy + 8 * miss));
                    if (Math.max(0.4, MissDef) >= Math.random()) {
                        if (i % 3 == 0) totalEcptBreak = totalEcptBreak + damage_skill * amount;
                        else totalEcptBreak = totalEcptBreak + damage * amount;
                    }
                }
            }
            case 1 -> {
                for (int i = 1; i <= 5000; i++) {
                    MissDef = (tmp_accuracy / (tmp_accuracy + 8 * miss));
                    if (Math.max(0.4, MissDef) >= Math.random()) {
                        if (i % 3 == 0) totalEcptBreak = totalEcptBreak + damage_skill * amount;
                        else totalEcptBreak = totalEcptBreak + damage * amount;
                    }
                }
            }
        }
        totalEcptBreak = totalEcptBreak + (double) (Times_onBreak * damage * amount);
        return totalEcptBreak;
    }
}
