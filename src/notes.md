# notes for software testing 

# TDD, DDT, CI (Devops)

# chuẩn bị sẵn github account

- DDT viết tắt của data driven testing - là kỹ thuật kiểm thử hướng theo tập data chuẩn bị sẵn

là kỹ thuật tách lời gọi hàm cần test ra 1 chỗ

data đầu vào và expected ra 1 chỗ khác

giúp :
    nhìn code dễ dàng hơn, trong sáng, tách biệt việc chuẩn bị data ra 1 chỗ -> giúp ta dễ tập trung trong việc build bộ data test ko bị trộn với code test đám data này vì việc kiểm thử đòi hỏi tính chất chặt chẽ, cẩn thận

    để test code cũng cần phải đẹp, chuẩn, dễ bảo trì


Trong giới công nghiệp/ các công ty phần mềm, tập data test để ở:
    - trong file excel theo hàng cột
    - trong text file (dùng tab để phân tách giá trị) dạng csv
    - nhúng trực tiếp trong code nhưng tách so với code Junit test
    - để trong table của database chưa toàn data để test, không phải database của app

# phân tích bài test hàm tính giai thừa
Input (n)               Expected (n!)
    0                       1
    1                       1
    2                       2
    3                       6
    4                       24
    5                       120
    6                       720

    AssertEquals(1, getF(0)) viết truyền thống

    dùng DDT assertEqual(expected, getF(input)) // tập data cần verify đặt thành các biến feed các biến vào code junit/unit test 
# kỹ thuât DDT
    Trong sáng, dễ hiểu, dễ đánh giá được thiếu case hay không, tình huống xài hàm đã có đủ đại diện chưa!!!

# chốt deal
    DDT chẳng qua là tách tập data test ra 1 chỗ, đặt cho chúng thành các biến tương ứng, rồi đưa biến vào hàm test!!!
    - DDT còn được gọi 1 tên mới: kiểm thử unit test kiểu tham số hóa - Parameterized - tham số hóa tập data test'

# notes
Một unit test framework thường có:
    - nhóm hàm assertX để so sánh giữa expected và actual
    - nhóm hàm bắt ngoại lệ có xuất hiện, ngoại lệ sẽ xuất hiện màu đỏ, nhưng nếu kiểm soát nó thì nó sẽ trả về màu xanh
    - tách data và câu lệnh test hàm ra riêng
    - chạy song song các test cases
    - có thể gài ràng buộc (Dependency) giữa các test case, ví dụ test case login thành công thì mới Crud
        test case login thành công --> chạy các test case sau
                        thất bại --> những  test case sau login là vô nghĩa 
    - generate ra report/báo cáo/ bản thống kê lỗi ở những test case nào
    - chạy ở chế độ dòng lệnh console/command line (giống ant có chạy test luôn) - test runner
    - generate luôn dùm các test cases và ta chỉ việc modify thay vì phải viết từ đầu như mấy bữa nay

# Git, github, gitlab, bitBucket 
Git là kỹ thuật quản lý source code
GitHub, GitLab, BitBucket cung cấp giải pháp lưu trữ code online  
quản lí code online  
miễn phí và có trả tiền theo dung lượng lưu trữ, số member tham  
gia vào dự án có lưu code ở trên 3 nền tảng này  

Quản lí code:  
- Lưu trữ code (Drive… cx làm đc)  
- Share code cho mọi người cùng tham gia sửa (Drive… cx làm đc)  
- Tracking history chỉnh sửa code - quản lí các phiên bản code - version của code  
    - quản lí sự thay đổi của các dòng code  
    - ai thêm code, thêm ngày giờ nào, dòng code nào (drive bó tay)
- undo lại code kể từ ngày đầu tiên hoặc đoạn lưng chừng (drive bó tay)
- ae đè code lẫn nhau, do sơ hở, do cùng làm trên 1 project, 1 tập tin, xóa lộn code của nhau, cả 2 cùng update trên 1 tập tin  -> conflict
- đồng bộ code của ae khác -> merge code của anh em khác
                    tao làm Fe -> máy tao 
                    mày làm Be sau đó gộp lại -> máy mày
                    tao mày gộp lại thành 1 project chung, tao mày đều có mảy riêng (Drive .. bó tay)

- copy/paste project được thì xài, sau đó được thì xài, không làm được thì xóa
            trước giờ làm thủ công ở local/máy tính -> drive... không làm được

tất cả vấn đề trên, git lo được hết

toàn bộ vấn đề trên cần tool nào để quản lý thì tuyệt vời cho dân dev tiết kiệm cực nhiều công sức cho
việc quản lý sự  thay đổi src code khi làm việc team work
-> các tool làm việc này gọi chung là: Vcs: version control system
                                        scm: source control management

Tool công nghệ cũ: SVN (Subversion) source safe

Tool công nghệ mới: Git

# Mô hình hoạt động git/github
Máy dev (local workspace)                   Github server (cloud, trên mạng)
                                            Gitlab server (cloud, trên mạng)


----------------> đẩy code lên server - checkin - thuật ngữ của scm 
                                        push  - thuật ngữ riêng của git
                down code về <---------- checkout - thuật ngữ chung của scm
                                        git clone
                                        git pull  -> thuật ngữ riêng của git

*code để trên server github/gitlab sẽ được đặt trong 1 folder - chính là tên của 1 folder chứa dự án ở local. Foldẻ chứa code ở trên server github được gọi là repository / repo - kho code

mỗi project tương ứng với 1 kho
-- ten kho nên và rất nên trùng 100% hoa thường với thư mục chứa code ở local


-- cách chơi với github

1. Tạo trên server 1 kho trùng tên (100% hoa thường với tên project ở local)

Trong thư mục dự án có người đi lên server có người ở lại local, không đồng bộ
--> git ignore kỹ  thuật dạy cho lệnh GIT biết đứa nào lên server đứa nào ở nhà

 ta tạo trong thư mục chứa code ở local (đồng bộ lên server)

 .gitignore chứa các danh sách các thư mục hay tập tin cần ở lại local
 - nếu không có tập tin này toàn bộ code sẽ bị đẩy lên server
 - dùng chat gpt hoặc tool tạo cho nhanh

# 4.1 Nhóm lệnh chỉ làm 1 lần duy nhất cho 1 máy lần đầu tiên chơi với Git
Sẽ làm lại các lệnh này nếu cài lại Windows, hoặc bạn đổi username/pass của GitHub/...

git config --global user.name <tên-url-github-của-bạn>

git config --global user.email <email-dùng-đk-github>

pass sẽ đc hỏi khi đưa code lên, Windows tự remember, sau này ko cần làm lại 2 lệnh này, trừ phi đổi pass, url GitHub, cài lại Win
# 4.2 Nhóm lệnh dùng cho mõi project ở local lần đầu tiên chuẩn bị lên server, leader, nhóm trưởng làm việc này trước
    1 lần cho project/ lặp lại cho project mới

    git init: khởi động cái thư mục ở local, chuẩn bị sẵn sàng đồng bộ lên server
            : tự tạo ra 1 folder tên là .git\ẩn chứa nhật ký thay đổi code ở local
            : cẩm tuyệt đối xóa sửa ở thư mục này, xem thử okie, , những thằng trong gitignore cũng ở lại

    git add . lênh này báo với git tao cần upload tất cả các tập tin local lên server 
    hoặc git add * lênh này báo với git tao cần upload tất cả các tập tin local lên server nhưng mà để lại những thằng trong gitignore và những thằng trong tên gọi có dấu . đầu tiên


    git commit -m <message>: Thông báo cho team biết mình sửa cái gì mình sửa gì trong kho chung

    git branch -M main: báo với git là đây là room chính chứa code ở local   chuẩn bị đưa lên server

    git remote add origin link.git báo với git tên ở local tên là gì, url ở đâu

    git push -u origin main chính thức đẩy lên server

KHo local được đồng bộ lên kho từ xa - sau đó ta invite team member vào edit code ->
team phải clone code về thành 1 folder trên local y chang máy leader

hoặc đưa url của kho cho bá tánh download (.zip)

# 4.3 Nhóm câu lệnh huyền thoại 
# xài từ ngày này qua tháng khác do ta thay đổi code theo tiến trình làm dự án
# Dù là sếp, lính, cũng chỉ 3 lệnh làm miết trên kho đã làm

    git add *

    git commit -m "sửa cái gì?"

    git push

# .md nghĩa là MARK DOWN là 1 ngôn ngữ đánh dấu, đơn giản và gọn nhẹ hơn HTML
# dùng cho 1 số việc nhẹ nhàng, không dùng làm FE
# vscode hay các tool IDE đều hiểu .md hiển thị màu sắc tag, dữ liệu
    * dấu # tương đương h1
    * dấu * tương đương với ul và li



# Nhập môn CI - Continuos integration - tích hợp liên tục

Là kỹ thuật đảm bảo chất lượng code của cả team không riêng của cá nhân
Vì code của dự án là do sự đóng góp của nhiều team member, 1 dự án có nhiều dev cùng code


mỗi dev phải dảm bảo code của mình ngon và phải đảm bảo code của mình cùng chung sống với dự án code phải ngon, cả dự án phải là màu Xanh thì mới ổn

Code trên server phải xanh trên tất cả

vậy CI là kỹ thuật gom code của ae lên server phải xanh cho tất cả khi gom (integration - tích hợp)


việc gom này diễn ra rất nhiều lần do code kéo dài thời gian cả tháng, cả năm, n người cùng làm -> việc kiểm tra xanh cho tất cả làm liên tục liên tục
- Tích hợp liên tục xuất hiện: tiến trình kiểm tra code của toàn dự án là màu xanh, diễn ra liên tục trên server được ai đó dev nào đó chỉnh sửa code

- Nói cách khác: Mỗi lần ai đó đẩy code lên server, màu xanh cho tất cả chạy ngay, kích hoạt ngay tiến trình kiểm tra xanh khi code server bị thay đổi

- Muốn làm CI cần:
- Source code của ae (dự án mà)
- Server chứa code để gom
- Unit test cho toàn dự án để có xanh đỏ
- Kích hoạt quy trình chạy unit test khi có bất kì gã dev nào sửa code trên server
- Notify được xanh đỏ tới team member khi có problem đỏ
- Tư động cái việc ở trên không cần chạy bằng cơm -> ta cấu hình server và những thứ liên qua để tạo quy trình xanh đỏ 1 cách tự động --> rẽ nhánh đi làm: CI/CD/Devops ko code app, code cho quy trình xanh đỏ, deploy lên server khai triển các hành động để từ code -> chất lượng code -> ra được app -> rồi lên server luôn

--------------------
NET BEANS 8 mặc định khi tạo project, tạo unitTest, clean & build nó không chạy bộ unit test để kiểm tra xanh đỏ
 dù gọi trực tiếp clean & build trong nb hay gọi ở của sổ  cmd bằng lệnh ant
 muốn netbeans 8.0 khi đóng gói app chạy bộ test trước khi đóng gói (.jar, .war)
 ta phải độ lại tập tin build-impl.xml bằng cách gọi lệnh test trong tập .xml này mở file tìm dòng 1005 bổ sung vào thêm
 <target depends="init,compile,-pre-pre-jar">
 <target depends="init,compile,test,-pre-pre-jar">
 nb 13 không cần làm, mặc định ant sẽ chạy test ở cmd
    nhưng vẫn cần chỉnh sửa lại trong file này khi clean & build trong nb
--------------------