package csvvalidator;

/**
 *
 * @author Intesar Mohammed
 */
public class Field implements Comparable<Field> {

    private int index;
    private String name;
    private Type type;
    private boolean isOptional;
    private String regex;

    public Field(int index, Type type, boolean isOptional) {
        this.index = index;
        this.type = type;
        this.isOptional = isOptional;
    }

    public Field(int index, String name, Type type, boolean isOptional) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.isOptional = isOptional;
    }

    public Field(int index, String name, Type type, boolean isOptional, String regex) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.isOptional = isOptional;
        this.regex = regex;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public boolean isIsOptional() {
        return isOptional;
    }

    public void setIsOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Field other = (Field) obj;
        if (this.index != other.index) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.index;
        return hash;
    }

    @Override
    public String toString() {
        return "Field{" + "index=" + index + ", name=" + name + ", type=" + type + ", isOptional=" + isOptional + ", regex=" + regex + '}';
    }

   
    @Override
    public int compareTo(Field that) {
        final int BEFORE = -1;
        final int EQUAL = 0;
        final int AFTER = 1;

        if (this.index < that.index) {
            return BEFORE;
        } else if (this.index > that.index) {
            return AFTER;
        } else {
            return EQUAL;
        }
    }
}
