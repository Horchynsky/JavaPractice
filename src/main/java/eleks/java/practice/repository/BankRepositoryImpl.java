package eleks.java.practice.repository;

import eleks.java.practice.dto.BankResponseDto;
import eleks.java.practice.entity.BankEntity;

import java.util.ArrayList;
import java.util.List;

public class BankRepositoryImpl implements BankRepository
{
    private final List<BankEntity> bankEntityList = new ArrayList<>();

    @Override
    public void add(BankEntity bankEntity)
    {
        bankEntityList.add(bankEntity);
    }

    @Override
    public List<BankEntity> getAllBanks()
    {
        return bankEntityList;
    }

    @Override
    public BankResponseDto getBankById(int id)
    {
        return null;
    }

    @Override
    public void deleteById(int id)
    {

    }
}
