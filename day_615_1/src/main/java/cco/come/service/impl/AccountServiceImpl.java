package cco.come.service.impl;



import cco.come.doname.Account;
import cco.come.mapper.AccountMapper;
import cco.come.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account findById(Integer id) {
        Account list = accountMapper.findById(id);


        return list;
    }
}
