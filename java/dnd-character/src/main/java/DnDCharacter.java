class DnDCharacter {
    int strength, dexterity, constitution, intelligence, wisdom, charisma = 0;

    int ability() {
        int a1, a2, a3, a4;
        a1 = (int) (Math.random() * 6);
        a2 = (int) (Math.random() * 6);
        a3 = (int) (Math.random() * 6);
        a4 = (int) (Math.random() * 6);
        return a1 + a2 + a3 + a4 - Math.min(Math.min(a1, a2), Math.min(a3, a4))+3;
    }

    int modifier(int input) {
        if(input<10){
            input--;
        }
        return (input - 10) / 2;
    }

    int getStrength() {
        if (strength == 0) {
            strength = ability();
        }
        return strength;
    }

    int getDexterity() {
        if (dexterity == 0) {
            dexterity = ability();
        }
        return dexterity;
    }

    int getConstitution() {
        if (constitution == 0) {
            constitution = ability();
        }
        return constitution;
    }

    int getIntelligence() {
        if (intelligence == 0) {
            intelligence = ability();
        }
        return intelligence;
    }

    int getWisdom() {
        if (wisdom == 0) {
            wisdom = ability();
        }
        return wisdom;
    }

    int getCharisma() {
        if (charisma == 0) {
            charisma = ability();
        }
        return charisma;
    }

    int getHitpoints() {
        return 10+modifier(getConstitution());
    }


}
