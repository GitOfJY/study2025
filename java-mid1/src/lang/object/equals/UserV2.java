package lang.object.equals;

import java.util.Objects;

public class UserV2 {
    // extends Object

    private String id;

    public UserV2(String id){
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj){
        UserV2 user = (UserV2) obj;
        // obj에 id(객체의 특정 값) 인자가 없기 때문에 다운캐스팅 필요
        return id.equals(user.id);
        // string 비교는 equals
    }
     */

    // 정확한 equals 구현 > alt+insert generate해서 이용
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
    
}
