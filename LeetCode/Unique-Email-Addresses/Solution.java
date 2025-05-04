class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueMailSet = new HashSet<>();
        for(String email : emails) {
            String domainName = email.split("@")[1];
            String mailerName = email.split("@")[0].replaceAll("[.]", "");
            if(mailerName.contains("+")) {
                mailerName = mailerName.substring(0, mailerName.indexOf('+'));
            }
            uniqueMailSet.add(mailerName+'@'+domainName);
        }
        return uniqueMailSet.size();
    }
}