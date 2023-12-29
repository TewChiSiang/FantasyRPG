public class Mage extends Character {
    private String elementalAffinity;

    public Mage(String characterID, String characterName, int level, String elementalAffinity) {
        super(characterID, characterName, level);
        this.elementalAffinity = elementalAffinity;
    }

    public void castElementalSpell(String spellType) {
        if (level < 5) {
            System.out.println(characterName + " needs to reach level 5 to cast spells.");
        } else {
            String message;
            switch (spellType) {
                case "Teleportation":
                    message = "Teleporting " + characterName + " out of danger!";
                    break;
                case "Illusion":
                    message = characterName + " is creating illusions to confuse the enemy.";
                    break;
                case "Detection":
                    message = characterName + " is detecting the presence of magic nearby...";
                    break;
                default:
                    message = characterName + " is trying to cast an unknown spell...";
                    break;
            }
            System.out.println(message);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Elemental Affinity: " + elementalAffinity + "\n";
    }
}