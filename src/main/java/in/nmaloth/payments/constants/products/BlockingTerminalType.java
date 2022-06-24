package in.nmaloth.payments.constants.products;

import in.nmaloth.payments.constants.InternationalApplied;
import in.nmaloth.payments.constants.TerminalType;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;

public class BlockingTerminalType implements Comparable<BlockingTerminalType> {
    private String internationalApplied;
    private String terminalType;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof BlockingTerminalType)) {
            return false;
        } else {
            BlockingTerminalType that = (BlockingTerminalType)o;
            return this.getTerminalType().equals(that.getTerminalType());
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.getTerminalType()});
    }

    public int compareTo(BlockingTerminalType o) {
        return this.terminalType.compareTo(o.getTerminalType());
    }


    public static BlockingTerminalType.BlockingTerminalTypeBuilder builder() {
        return new BlockingTerminalType.BlockingTerminalTypeBuilder();
    }

    public String getInternationalApplied() {
        return this.internationalApplied;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public void setInternationalApplied(final String internationalApplied) {
        this.internationalApplied = internationalApplied;
    }

    public void setTerminalType(final String terminalType) {
        this.terminalType = terminalType;
    }

    public BlockingTerminalType() {
    }

    public BlockingTerminalType(final String internationalApplied, final String terminalType) {
        if(internationalApplied != null){
            this.internationalApplied = internationalApplied;
        }
        this.terminalType = terminalType;
    }

    public static class BlockingTerminalTypeBuilder {
        private InternationalApplied internationalApplied;
        private TerminalType terminalType;

        BlockingTerminalTypeBuilder() {
        }

        public BlockingTerminalType.BlockingTerminalTypeBuilder internationalApplied(final InternationalApplied internationalApplied) {
            this.internationalApplied = internationalApplied;
            return this;
        }

        public BlockingTerminalType.BlockingTerminalTypeBuilder terminalType(final TerminalType terminalType) {
            this.terminalType = terminalType;
            return this;
        }

        public BlockingTerminalType build() {
            return new BlockingTerminalType(this.internationalApplied.getBlockInternational(), this.terminalType.getTerminalType());
        }

        public String toString() {
            return "BlockingTerminalType.BlockingTerminalTypeBuilder(internationalApplied=" + this.internationalApplied + ", terminalType=" + this.terminalType + ")";
        }
    }
}

