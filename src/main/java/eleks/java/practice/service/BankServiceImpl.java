package eleks.java.practice.service;

import eleks.java.practice.dto.BankRequestDto;
import eleks.java.practice.dto.BankResponseDto;
import eleks.java.practice.mapper.BankMapper;
import eleks.java.practice.repository.BankRepositoryImpl;

import java.util.List;

public class BankServiceImpl implements BankService
{
    private final BankRepositoryImpl bankRepositoryImpl = new BankRepositoryImpl();
    private final BankMapper bankMapper = new BankMapper();

    @Override
    public void createBank(BankRequestDto bankRequestDto)
    {
        //TODO add check unique object
        bankRepositoryImpl.add(bankMapper.bankRequestDtoToBankEntity(bankRequestDto));
    }

    @Override
    public List<BankResponseDto> getAllBanks()
    {
        return bankRepositoryImpl.getAllBanks()
            .stream()
            .map(bankMapper::bankEntityToBankResponseDto)
            .toList();
    }

    @Override
    public BankResponseDto getById(int id)
    {
        return null;
    }

    @Override
    public void deleteById(int id)
    {

    }
}
