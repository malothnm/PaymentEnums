package in.nmaloth.payments.keys;

import in.nmaloth.payments.keys.constants.KeyType;
import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HSMKeyId {

    private int org;
    private int product;
    private KeyType keyType;
    private String zone = "00";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HSMKeyId)) return false;
        HSMKeyId hsmKeyId = (HSMKeyId) o;
        return getOrg() == hsmKeyId.getOrg() &&
                getProduct() == hsmKeyId.getProduct() &&
                getKeyType() == hsmKeyId.getKeyType() &&
                getZone().equals(hsmKeyId.getZone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrg(), getProduct(), getKeyType(), getZone());
    }
}
