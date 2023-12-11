package HomeWorks.HW_2;

/**
 * Описание сущности персонажа Мага
 */
public class Mage implements ExperienceHolder {
    private String name;
    private int currentLevel = 1;
    private int currentExperience = 0;
    private int levelExperience = 100;


    public Mage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getCurrentLevel() {
        return currentLevel;
    }

    @Override
    public int getCurrentExperience() {
        return currentExperience;
    }

    @Override
    public int getLevelExperience() {
        return levelExperience;
    }

    @Override
    public void setCurrentLevel(int level) {
        this.currentLevel = level;
    }

    @Override
    public void setCurrentExperience(int experience) {
        this.currentExperience = experience;
    }
}
