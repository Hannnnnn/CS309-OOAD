package original_adapter;

import java.util.List;

public interface ManageStaffInterface {
    void addingStaff(List<StaffModel> list);

    void removeStaff(List<StaffModel> list, String name);
}
