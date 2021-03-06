package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import panzer.contracts.Assembler;
import panzer.contracts.AttackModifyingPart;
import panzer.contracts.DefenseModifyingPart;
import panzer.contracts.HitPointsModifyingPart;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.List;

public class VehicleAssemblerTest {

    private Assembler vehicleAssembler;

    private AttackModifyingPart attackModifyingPart;

    private DefenseModifyingPart defenseModifyingPart;

    private HitPointsModifyingPart hitPointsModifyingPat;

    @Before
    public void setUp() throws Exception {
        // инициализираме си инстанция от класа който ще тестваме
        this.vehicleAssembler = new VehicleAssembler();

        // създаваме си три кухи класове(обекти) с помоща на Mockito
        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        this.defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        this.hitPointsModifyingPat = Mockito.mock(HitPointsModifyingPart.class);

        // и след това си вкарва мокнати части във всяка една колекция на класа
        this.vehicleAssembler.addArsenalPart(this.attackModifyingPart);
        this.vehicleAssembler.addShellPart(this.defenseModifyingPart);
        this.vehicleAssembler.addEndurancePart(this.hitPointsModifyingPat);
    }

    @Test
    public void getTotalWeight() {
        //  Arrange
        Mockito.when(this.attackModifyingPart.getWeight()).thenReturn(10.0);
        Mockito.when(this.defenseModifyingPart.getWeight()).thenReturn(20.0);
        Mockito.when(this.hitPointsModifyingPat.getWeight()).thenReturn(30.0);

        //  Act
        double weight = this.hitPointsModifyingPat.getWeight();
        double actualTotalWeight = this.vehicleAssembler.getTotalWeight();
        double expectedTotalWeight = 60.0;

        //  Assert
        Assert.assertEquals(expectedTotalWeight, actualTotalWeight, 0.1);
    }

    @Test
    public void getTotalPrice() {
        //  Arrange
        Mockito.when(this.attackModifyingPart.getPrice()).thenReturn(BigDecimal.ZERO);
        Mockito.when(this.defenseModifyingPart.getPrice()).thenReturn(BigDecimal.TEN);
        Mockito.when(this.hitPointsModifyingPat.getPrice()).thenReturn(BigDecimal.ONE);

        //  Act
        BigDecimal actualTotalPrice = this.vehicleAssembler.getTotalPrice();
        BigDecimal expectedTotalPrice = BigDecimal.valueOf(11);

        // Assert
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    public void getTotalPriceWithoutParts() {
        Assembler assembler = new VehicleAssembler();

        //  Act
        BigDecimal actualTotalPrice = assembler.getTotalPrice();
        BigDecimal expectedTotalPrice = BigDecimal.ZERO;

        // Assert
        Assert.assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Test
    public void getTotalAttackModification() {
        //  Arrange
        Mockito.when(this.attackModifyingPart.getAttackModifier()).thenReturn(50);
        AttackModifyingPart attackModifyingPart = Mockito.mock(AttackModifyingPart.class);
        Mockito.when(attackModifyingPart.getAttackModifier()).thenReturn(120);
        this.vehicleAssembler.addArsenalPart(attackModifyingPart);

        //  Act
        long actualTotalAttackModification = this.vehicleAssembler.getTotalAttackModification();
        long expectedTotalAttackModification = 170;

        //  Assert
        Assert.assertEquals(expectedTotalAttackModification, actualTotalAttackModification);
    }

    @Test
    public void getTotalDefenseModification() {
        //  Arrange
        Mockito.when(this.defenseModifyingPart.getDefenseModifier()).thenReturn(50);
        DefenseModifyingPart defenseModifyingPart = Mockito.mock(DefenseModifyingPart.class);
        Mockito.when(defenseModifyingPart.getDefenseModifier()).thenReturn(120);
        this.vehicleAssembler.addShellPart(defenseModifyingPart);

        //  Act
        long actualTotalDefenseModification = this.vehicleAssembler.getTotalDefenseModification();
        long expectedTotalDefenceModification = 170;

        //  Assert
        Assert.assertEquals(expectedTotalDefenceModification, actualTotalDefenseModification);
    }

    @Test
    public void getTotalHitPointModification() {
        //  Arrange
        Mockito.when(this.hitPointsModifyingPat.getHitPointsModifier()).thenReturn(50);
        HitPointsModifyingPart hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);
        Mockito.when(hitPointsModifyingPart.getHitPointsModifier()).thenReturn(120);
        this.vehicleAssembler.addEndurancePart(hitPointsModifyingPart);

        //  Act
        long actualTotalHitPointModification = this.vehicleAssembler.getTotalHitPointModification();
        long expectedTotalHitPointModification = 170;

        //  Assert
        Assert.assertEquals(expectedTotalHitPointModification, actualTotalHitPointModification);
    }

    @Test
    public void testAddArsenalPartCollectionSize() {
        //  Arrange
        Assembler assembler = new VehicleAssembler();
        AttackModifyingPart part = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part1 = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part2 = Mockito.mock(AttackModifyingPart.class);

        //  Act
        assembler.addArsenalPart(part);
        assembler.addArsenalPart(part1);
        assembler.addArsenalPart(part2);

        int actualSize = 0;

        try {
            Field arsenalParts = assembler.getClass().getDeclaredField("arsenalParts");
            arsenalParts.setAccessible(true);
            List<AttackModifyingPart> parts = (List<AttackModifyingPart>) arsenalParts.get(assembler);

            actualSize = parts.size();

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        int expectedSize = 3;

        //  Assert

        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void testAddArsenalPart() {
        //  Arrange
        Assembler assembler = new VehicleAssembler();

        AttackModifyingPart part = Mockito.mock(AttackModifyingPart.class);
        AttackModifyingPart part1 = Mockito.mock(AttackModifyingPart.class);

        Mockito.when(part.getAttackModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part1.getAttackModifier()).thenReturn(Integer.MAX_VALUE);

        // Act

        assembler.addArsenalPart(part);
        assembler.addArsenalPart(part1);

        //  Act
        long actualTotalAttackModification = assembler.getTotalAttackModification();
        long expectedTotalAttackModification = (long) Integer.MAX_VALUE + Integer.MAX_VALUE;

        //  Assert

        Assert.assertEquals(expectedTotalAttackModification, actualTotalAttackModification);
    }

    @Test
    public void addShellPart() {
        //  Arrange
        Assembler assembler = new VehicleAssembler();

        DefenseModifyingPart part = Mockito.mock(DefenseModifyingPart.class);
        DefenseModifyingPart part1 = Mockito.mock(DefenseModifyingPart.class);

        Mockito.when(part.getDefenseModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part1.getDefenseModifier()).thenReturn(Integer.MAX_VALUE);

        // Act

        assembler.addShellPart(part);
        assembler.addShellPart(part1);

        //  Act
        long actualTotalDefenceModification = assembler.getTotalDefenseModification();
        long expectedTotalDefenceModification = (long) Integer.MAX_VALUE + Integer.MAX_VALUE;

        //  Assert

        Assert.assertEquals(expectedTotalDefenceModification, actualTotalDefenceModification);
    }

    @Test
    public void addEndurancePart() {
        //  Arrange
        Assembler assembler = new VehicleAssembler();

        HitPointsModifyingPart part = Mockito.mock(HitPointsModifyingPart.class);
        HitPointsModifyingPart part1 = Mockito.mock(HitPointsModifyingPart.class);

        Mockito.when(part.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);
        Mockito.when(part1.getHitPointsModifier()).thenReturn(Integer.MAX_VALUE);

        // Act

        assembler.addEndurancePart(part);
        assembler.addEndurancePart(part1);

        //  Act
        long actualTotalHitPointModification = assembler.getTotalHitPointModification();
        long expectedTotalHitPointModification = (long) Integer.MAX_VALUE + Integer.MAX_VALUE;

        //  Assert

        Assert.assertEquals(expectedTotalHitPointModification, actualTotalHitPointModification);
    }
}