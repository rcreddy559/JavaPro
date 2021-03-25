import java.time.LocalDateTime;
import java.util.List;

public record Orders(Long id,
                     Double totalAmount,
                     String status,
                     Long paymntDtlsID,
                     Long userID,
                     Long shippingID,
                     LocalDateTime createDate,
                     LocalDateTime modifiedDate,
                     List<String> invoice) {

    public static void main(String[] args) {
        Orders orders = new Orders(101010L,
                30303D,
                "status",
                88L,
                383L,
                222L,
                LocalDateTime.now(),
                LocalDateTime.now(), null);

        System.out.println(orders.createDate());
    }
}
