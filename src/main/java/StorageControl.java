public class StorageControl {
    static String compute(String instructions) {
        boolean hasBlock = false;
        int pos = 0;
        int limitBlocks = 15;
        int[] store = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        StringBuilder result = new StringBuilder();

        for(char instruction: instructions.toCharArray()){
            switch (instruction){
                case 'P':
                    if (hasBlock)
                        pos = 0;
                    else
                        hasBlock = true;
                    break;
                case 'M':
                    if(pos < 10)
                        pos++;
                    break;
                case 'L':
                    if(hasBlock && store[pos] <= limitBlocks)
                        store[pos]++;
                    break;
            }
        }

        for(int item : store){
            result.append(Integer.toHexString(item).toUpperCase());
        }
        return result.toString();
    }
}
