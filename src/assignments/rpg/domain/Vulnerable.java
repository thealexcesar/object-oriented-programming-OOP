package assignments.rpg.domain;

public interface Vulnerable {
    boolean isWeakTo(AbilityType abilityType);
}