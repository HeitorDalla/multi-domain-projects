public class App {
    public static void main(String[] args) throws Exception {
        int nums[] = {1, 2, 3};

        nums[0] = nums.length;
        
        // for (int i : nums) {
        //     System.out.println(i);
        // }

        String pessoas[] = {"Heitor", "Marli", "Gilmar"};
        String faculdades[] = {"Analise e Desenvolvimento de Sistemas", "Qualquer por ai", "Direito"};

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }

        for (String pessoa : pessoas) {
            System.out.println(pessoa);
            for (String faculdade : faculdades) {
                System.out.println(faculdade);
            }
        }
    }
}