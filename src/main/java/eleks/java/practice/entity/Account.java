package eleks.java.practice.entity;

import java.util.Objects;

public class Account
{
    private int id;
    private String name;

    public Account(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Account()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Account account = (Account) o;
        return id == account.id && Objects.equals(name, account.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "Account{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
    }
}
