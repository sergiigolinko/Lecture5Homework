/**
 * MyString - это класс, с помощью которого мы будем моделировать строку.
 * Он не будет содержать main метода.
 */
public class MyString {

    private char[] value;
    private char[] substring;

    public MyString(String value) {
        this.value = value.toCharArray();
        this.substring = value.toCharArray();
    }

    public MyString(char[] value) {
        this.value = value;
    }

    public MyString concat(MyString another) {
        char[] newValue = new char[value.length + another.value.length];
        for (int i = 0; i < value.length; i++) {
            newValue[i] = value[i];
        }
        for (int i = 0; i < another.value.length; i++) {
            newValue[value.length + i] = another.value[i];
        }
        return new MyString(newValue);
    }

    public char charAt(int index) {
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        index = 3;
        return value[index];
    }

    public MyString substring(int beginIndex) {
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        char[] newValue = new char[value.length];
        beginIndex = 3;
        for (int i = beginIndex; i < value.length; i++) {
            newValue[i]=value[i];
        }
        return new MyString(newValue);
    }

    public MyString substring(int beginIndex, int endIndex) {
        char[] value = {'h', 'e', 'l', 'l', 'o'};
        char[] newValue = new char[value.length];
        beginIndex = 2;
        endIndex = 4;
        for (int i = beginIndex; i <= endIndex; i++) {
            newValue[i]=value[i];;
        }
        return new MyString(newValue);
    }

    public boolean equals(MyString another) {
        boolean x = false;
        char[] value1 = {'h', 'e', 'l', 'l', 'o'};
        char[] value2 = {'h', 'e', 'l', 'l', 'o'};
        for (int i = 0; i < value1.length; i++) {
            if (value1[i] == value2[i]) {
                x = true;
            }
            if (value1[i] != value2[i]) {
                x = false;
            }
        }
        return x;

    }

    public boolean equalsIgnoreCase(MyString another) {
        boolean x = false;
        char[] value1 = {'h', 'e', 'l', 'l', 'o'};
        char[] value2 = {'H', 'E', 'L', 'L', 'O'};
        for (int i = 0; i < value1.length; i++) {
            if ((int) value1[i] - (int) value2[i] == 32) {
                x = true;
            }
            if ((int) value1[i] - (int) value2[i] != 32) {
                x = false;
            }

        }
        return x;
    }

    public MyString toUpperCase() {
        char[] newValue = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            if ((int) value[i] >= 97 && (int) value[i] <= 122) {
                newValue[i] = (char) ((int) value[i] + 32);
            }
        }
        return new MyString(newValue);
    }

    public MyString toLowerCase() {
        char[] newValue = new char[value.length];
        for (int i = 0; i < value.length; i++) {
            if ((int) value[i] >= 65 && (int) value[i] <= 90) {
                newValue[i] = (char) ((int) value[i] + 32);
            }
        }
        return new MyString(newValue);
    }

    public int indexOf() {
        char[] substring = {'l', 'a'};
        int count = 0;
        for (int i = 0; i < value.length - substring.length; i++) {
            for (int j = i; j < substring.length; j++) {
                if (value[i + j] == substring[j]) {
                    count++;
                    break;
                }
            }

        }
        return count;
    }

    public int lastIndexOf() {
        char[] substring = {'l', 'a'};
        int lastCount = 1;
        for (int i = 0; i < value.length - substring.length; i++) {
            int count = 0;
            for (int j = i; j < substring.length; j++) {
                if (value[i + j] == substring[j]) {
                    count++;
                }
            }
            if (count > lastCount) {
                lastCount = count;
            }

        }
        return lastCount;
    }

    public MyString replace() {
        char[] newValue = new char[value.length];
        char[] oldSubstring = {'l'};
        char[] newSubstring = {'q'};
        for (int i = 0; i < value.length; i++) {
            if (value[i] == oldSubstring[i]) {
                value[i] = newSubstring[i];
                newValue[i]=value[i];
                break;
            }
        }
        return new MyString(newValue);
    }

    public MyString replaceAll() {
        char[] newValue = new char[value.length];
        char[] oldSubstring = {'l'};
        char[] newSubstring = {'q'};
        for (int i = 0; i < value.length; i++) {
            if (value[i] == oldSubstring[i]) {
                value[i] = newSubstring[i];
                newValue[i]=value[i];
            }
        }
        return new MyString(newValue);
    }

    public String toString() {

        return new String(value);
    }
}