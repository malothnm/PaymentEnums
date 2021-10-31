package in.nmaloth.payments.keys;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class HSMKey {

    private String keyA;
    private String keyB;
    private String kcv;
    private String keyScheme;

}
