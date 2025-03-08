class ltcb{
        public static void main(String args[]) {
            // Đọc giá trị S, v0, a từ tham số dòng lệnh
            double S = Double.parseDouble(args[0]);
            double v0 = Double.parseDouble(args[1]);
            double a = Double.parseDouble(args[2]);

            // Kiểm tra điều kiện đầu vào
            if (S > 0 && v0 > 0 && a > 0) {
                // Giải phương trình bậc 2: S = v0 * t + (a * t^2) / 2
                double delta = Math.pow(v0, 2) + 2 * a * S;

                if (delta >= 0) {
                    // Tính hai nghiệm của phương trình bậc 2
                    double time1 = (-v0 + Math.sqrt(delta)) / a;
                    double time2 = (-v0 - Math.sqrt(delta)) / a;

                    // Chọn nghiệm dương hợp lệ
                    double time;
                    if (time1 > 0 && time2 > 0) {
                        time = Math.min(time1, time2); // Lấy nghiệm nhỏ hơn
                    } else if (time1 > 0) {
                        time = time1;
                    } else if (time2 > 0) {
                        time = time2;
                    } else {
                        time = -1; // Không có nghiệm dương
                    }

                    // Xuất kết quả
                    if (time == -1) {
                        System.out.println("-1");
                    } else {
                        System.out.println((Math.round(time * 100.0)) / 100.0);
                    }
                } else {
                    System.out.println("-1"); // Không có nghiệm thực
                }
            } else {
                System.out.println("-1"); // Điều kiện đầu vào không hợp lệ
            }
        }
    }