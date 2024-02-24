package com.samtha.expensetrackerapi.service;

import com.samtha.expensetrackerapi.entity.Expense;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExpenseService {

    List<Expense> getAllExpenses();

}
