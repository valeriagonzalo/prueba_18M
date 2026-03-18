package es.uah.matcomp.mp.e1.ejerciciosclases.b.Account;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    @Test
    void testConstructorWithBalance() {
        Customer customer = new Customer(1, "Juan Pérez", 'M');
        Account account = new Account(1001, customer, 500.0);

        assertEquals(1001, account.getId());
        assertEquals(customer, account.getCustomer());
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    void testConstructorWithoutBalance() {
        Customer customer = new Customer(2, "Ana García", 'F');
        Account account = new Account(1002, customer);

        assertEquals(1002, account.getId());
        assertEquals(customer, account.getCustomer());
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void testGetCustomerName() {
        Customer customer = new Customer(3, "Carlos López", 'M');
        Account account = new Account(1003, customer, 1000.0);

        assertEquals("Carlos López", account.getCustomerName());
    }

    @Test
    void testSetBalance() {
        Customer customer = new Customer(4, "María Rodríguez", 'F');
        Account account = new Account(1004, customer, 200.0);

        account.setBalance(750.50);
        assertEquals(750.50, account.getBalance(), 0.001);
    }

    @Test
    void testDeposit() {
        Customer customer = new Customer(5, "Pedro Sánchez", 'M');
        Account account = new Account(1005, customer, 300.0);

        Account returnedAccount = account.deposit(150.75);

        // Verificar que el saldo se actualizó correctamente
        assertEquals(450.75, account.getBalance(), 0.001);

        // Verificar que devuelve el mismo objeto (this)
        assertSame(account, returnedAccount);

        // Probar depósito adicional
        account.deposit(100.0);
        assertEquals(550.75, account.getBalance(), 0.001);
    }

    @Test
    void testWithdrawSufficientBalance() {
        Customer customer = new Customer(6, "Laura Martínez", 'F');
        Account account = new Account(1006, customer, 1000.0);

        Account returnedAccount = account.withdraw(350.25);

        // Verificar que el saldo se actualizó correctamente
        assertEquals(649.75, account.getBalance(), 0.001);

        // Verificar que devuelve el mismo objeto (this)
        assertSame(account, returnedAccount);
    }

    @Test
    void testWithdrawInsufficientBalance() {
        Customer customer = new Customer(7, "David Gómez", 'M');
        Account account = new Account(1007, customer, 500.0);

        // Capturar la salida del sistema para verificar el mensaje de error
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Account returnedAccount = account.withdraw(600.0);

        // Restaurar la salida del sistema
        System.setOut(System.out);

        // Verificar que el saldo NO cambió
        assertEquals(500.0, account.getBalance(), 0.001);

        // Verificar el mensaje de error
        assertEquals("amount withdrew exceeds the current balance!\n", outContent.toString());

        // Verificar que devuelve el mismo objeto (this)
        assertSame(account, returnedAccount);
    }

    @Test
    void testWithdrawExactBalance() {
        Customer customer = new Customer(8, "Elena Ruiz", 'F');
        Account account = new Account(1008, customer, 250.0);

        account.withdraw(250.0);

        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    void testToString() {
        Customer customer = new Customer(9, "Javier Torres", 'M');
        Account account = new Account(1009, customer, 1234.56);

        assertEquals("Javier Torres(9) balance = $ 1234.56", account.toString());

        // Probar con saldo cero
        Account account2 = new Account(1010, customer, 0.0);
        assertEquals("Javier Torres(9) balance = $ 0.00", account2.toString());

        // Probar con saldo con muchos decimales (formateo)
        Account account3 = new Account(1011, customer, 99.999);
        assertEquals("Javier Torres(9) balance = $ 100.00", account3.toString()); // Redondeo
    }

    @Test
    void testEncadenamientoMetodos() {
        Customer customer = new Customer(10, "Sofia Díaz", 'F');
        Account account = new Account(1012, customer, 1000.0);

        // Probar encadenamiento de métodos deposit y withdraw
        account.deposit(200.0).withdraw(150.0).deposit(50.0);

        assertEquals(1100.0, account.getBalance(), 0.001);
    }
}