public class Cat {
    private int id;
    private String name;
    private int age;
    private int weight;
    private int attackPower;
    private int shieldLevel;
    private String namePerson;

    public Cat() {
    }

    public Cat(String name, int age, int weight, int attackPower, int shieldLevel, String namePerson) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.attackPower = attackPower;
        this.shieldLevel = shieldLevel;
        this.namePerson = namePerson;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getShieldLevel() {
        return shieldLevel;
    }

    public void setShieldLevel(int shieldLevel) {
        this.shieldLevel = shieldLevel;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (id != cat.id) return false;
        if (age != cat.age) return false;
        if (weight != cat.weight) return false;
        if (attackPower != cat.attackPower) return false;
        if (shieldLevel != cat.shieldLevel) return false;
        if (!name.equals(cat.name)) return false;
        return namePerson != null ? namePerson.equals(cat.namePerson) : cat.namePerson == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        result = 31 * result + weight;
        result = 31 * result + attackPower;
        result = 31 * result + shieldLevel;
        result = 31 * result + (namePerson != null ? namePerson.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", attackPower=" + attackPower +
                ", shieldLevel=" + shieldLevel +
                ", namePerson='" + namePerson + '\'' +
                '}';
    }
}
