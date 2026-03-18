package es.uah.matcomp.mp.e1.ejerciciosclases.a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account acc = new Account("A1", "Juan", 100);
        assertEquals("A1", acc.getID());
    }

    @Test
    void getName() {
        Account acc = new Account("A1", "Juan", 100);
        assertEquals("Juan", acc.getName());
    }

    @Test
    void getBalance() {
        Account acc = new Account("A1", "Juan", 100);
        assertEquals(100, acc.getBalance());
    }

    @Test
    void testToString() {
        Account acc = new Account("A1", "Juan", 100);
        assertEquals("Account: [id = A1 name = Juan balance = 100]", acc.toString());
    }

    @Test
    void credit() {
        Account acc = new Account("A1", "Juan", 100);
        acc.credit(50);
        assertEquals(150, acc.getBalance());
    }

    @Test
    void debitOK() {
        Account acc = new Account("A1", "Juan", 100);
        acc.debit(40);
        assertEquals(60, acc.getBalance());
    }

    @Test
    void debitInsufficient() {
        Account acc = new Account("A1", "Juan", 50);
        acc.debit(100);
        assertEquals(50, acc.getBalance()); // rama else
    }

    @Test
    void transferOK() {
        Account a1 = new Account("A1", "Juan", 100);
        Account a2 = new Account("A2", "Ana", 0);

        a1.transferTo(a2, 50);

        assertEquals(50, a1.getBalance());
        assertEquals(50, a2.getBalance());
    }

    @Test
    void transferInsufficient() {
        Account a1 = new Account("A1", "Juan", 30);
        Account a2 = new Account("A2", "Ana", 0);

        a1.transferTo(a2, 100);

        assertEquals(30, a1.getBalance());
        assertEquals(0, a2.getBalance());
    }

    @Test
    void toStringExact() {
        Account acc = new Account("A1", "Juan", 100);
        assertEquals("Account: [id = A1 name = Juan balance = 100]", acc.toString());
    }
}