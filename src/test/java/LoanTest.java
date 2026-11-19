import models.Book;
import models.Loan;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoanTest {

	//G
	@Test
	public void testDueDate() {
		Book book = new Book(1, "Learning Java", "", "", "", 0);

		LocalDate before = LocalDate.now();
		Loan loan = new Loan(1, null, book);
		LocalDate after = LocalDate.now();

		// Accepts either date in case midnight passes while the test runs
		assertTrue(loan.getDueDate().equals(before.plusDays(14))
				|| loan.getDueDate().equals(after.plusDays(14)));
   }

	//VG
	@Test
	void newLoanShouldBeCurrent() {

	}
	
	//VG
	@Test
	void endLoanShouldBeHistoric() {
		
	}	
}