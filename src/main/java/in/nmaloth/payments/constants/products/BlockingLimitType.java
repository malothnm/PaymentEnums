package in.nmaloth.payments.constants.products;


import in.nmaloth.payments.constants.InternationalApplied;
import in.nmaloth.payments.constants.card.LimitType;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class BlockingLimitType implements Comparable<BlockingLimitType> {
    private String internationalApplied;
    private String limitType;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof BlockingLimitType)) {
            return false;
        } else {
            BlockingLimitType that = (BlockingLimitType)o;
            return this.getLimitType().equals(that.getLimitType());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getLimitType()});
    }

    public int compareTo(BlockingLimitType o) {
        return this.limitType.compareTo(o.getLimitType());
    }



    public static BlockingLimitType.BlockingLimitTypeBuilder builder() {
        return new BlockingLimitType.BlockingLimitTypeBuilder();
    }

    public String getInternationalApplied() {
        return this.internationalApplied;
    }

    public String getLimitType() {
        return this.limitType;
    }

    public void setInternationalApplied(final String internationalApplied) {
        this.internationalApplied = internationalApplied;
    }

    public void setLimitType(final String limitType) {
        this.limitType = limitType;
    }

    public BlockingLimitType() {
    }

    public BlockingLimitType(final String internationalApplied, final String limitType) {
        if(internationalApplied != null){
            this.internationalApplied = internationalApplied;
        }
        this.limitType = limitType;
    }

    public static class BlockingLimitTypeBuilder {
        private InternationalApplied internationalApplied;
        private LimitType limitType;

        BlockingLimitTypeBuilder() {
        }

        public BlockingLimitType.BlockingLimitTypeBuilder internationalApplied(final InternationalApplied internationalApplied) {
            this.internationalApplied = internationalApplied;
            return this;
        }

        public BlockingLimitType.BlockingLimitTypeBuilder limitType(final LimitType limitType) {
            this.limitType = limitType;
            return this;
        }

        public BlockingLimitType build() {
            return new BlockingLimitType(this.internationalApplied.getBlockInternational(), this.limitType.getLimitType());
        }

        public String toString() {
            return "BlockingLimitType.BlockingLimitTypeBuilder(internationalApplied=" + this.internationalApplied + ", limitType=" + this.limitType + ")";
        }
    }
}
