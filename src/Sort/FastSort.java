package Sort;

/**
 * �൱�ڱ����м�ֵ��������Ϊ�м�ֵ��λ���൱�ڿգ����ڽ����������������Ų������λ�õ���ֵ
 */
public class FastSort {

    private static int[]  nums = {2,0,2,1,1,0};

    //ʵ�ʾ����ҵ���Чλ�ã�
    //     �����Чλ�������м�ֵ����ߣ������ұ���С���м�ֵ����ֵ���
    //     �����Чλ�������м�ֵ���ұߣ���������д����м�ֵ����ֵ���
    private static void sort(int[] nums,int begin,int end){

        System.out.println("begin:"+begin+",end:"+end);

        if(begin<end) {

            int middle = nums[begin];

            int i = begin;
            int j = end;

            while (i < j) {

                //�ұ��Ǵ����м�ֵ�ģ������ڻ��ߵ���ʱ���������ƶ�
                while (i < j && middle <= nums[j]) {
                    j--;
                }

                //���ұߴ���С���м�ֵ�ģ��ͽ��ұߵ�ֵ�������м�ֵ�ĵط�����һ��ʼbegin�ĵط�
                //����begin��j�ĵط�����ȣ��Ǳ�Ȼ������Ч��λ�ã���j��λ�õ�ֵʵ������Ч�ģ�
                //��Ϊ�ŵ�i��λ�ã����Ա�����j������ҵ����м��ֵ��ĵط�����������Чλ�ã�
                if (i < j) {
                    nums[i++] = nums[j];
                }

                //����Ǳ���С���м�ֵ�ĵط�����С�ڻ����ʱ���������ƶ�
                while (i < j && middle >= nums[i]) {
                    i++;
                }

                //����ߴ��ڴ����м�ֵ�ģ��ͽ���ߵ�ֵ��i��ֵ���ŵ�֮ǰ��Ч��λ�ã���j��λ�ã�
                //��Ϊi��ֵ��j��ֵ��ȣ�ʵ����i��ֵ�ŵ���j�ĵط�������i��λ������Ч�ģ�����
                //��������Ч��λ�þ�ת�Ƶ�i��λ��
                if (i < j) {
                    nums[j--] = nums[i];
                }
            }

            //����м�ֵ���ŵ���Ч��λ�õĵط�
            nums[i] = middle;

            sort(nums, begin, i);
            sort(nums,i+1,end);
        }
    }

    public static void main(String[] args) {

        print(nums);
        sort(nums,0,nums.length-1);
        print(nums);
    }

    private static void print(int[] _nums){
        for (int i:_nums ) {
            System.out.printf(i+",");
        }
    }

}
