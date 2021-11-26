package builder;

import lombok.Data;

@Data
public class Builder {
    private Integer id;
    private String str;
    private Double d;

    public Builder(){}

    public Builder(Integer id, String str, Double d){
        this.id = id;
        this.str = str;
        this.d = d;
    }

    public static class BuilderBuilder{
        private Integer id;
        private String str;
        private Double d;

        public BuilderBuilder(){}

        public BuilderBuilder id(Integer id){
            this.id = id;
            return this;
        }

        public BuilderBuilder str(String str){
            this.str = str;
            return this;
        }

        public BuilderBuilder d(Double d){
            this.d = d;
            return this;
        }

        public Builder build(){
            return new Builder(this.id, this.str, this.d);
        }
    }
}
