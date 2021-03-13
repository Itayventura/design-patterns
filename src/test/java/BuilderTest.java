import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderTest {

    public static Builder builder;

    @BeforeEach
    void setUp() {
        builder = new Builder();
    }

    @Test
    void test(){
        Builder.BuilderBuilder builderBuilder = new Builder.BuilderBuilder();
        System.out.println(builder);
        assertNull(builder.getId());
        assertNull(builder.getD());
        assertNull(builder.getStr());
        builder = builderBuilder.id(1).d(1.0).str("1").build();
        System.out.println(builder);
        assertEquals(1, builder.getId());
        assertEquals(1.0, builder.getD());
        assertEquals("1", builder.getStr());
    }
}