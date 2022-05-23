package eleks.java.practice.repository;

import eleks.java.practice.dto.BankResponseDto;
import eleks.java.practice.entity.BankEntity;

import java.util.List;

public interface BankRepository
{
    void add(BankEntity bankEntity);

    List<BankEntity> getAllBanks();

    BankResponseDto getBankById(int id);

    void deleteById(int id);
}
