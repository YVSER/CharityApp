package ma.emsi.donationms.Repository;

import ma.emsi.donationms.DAO.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepo extends JpaRepository<Donation, Long> {
}
