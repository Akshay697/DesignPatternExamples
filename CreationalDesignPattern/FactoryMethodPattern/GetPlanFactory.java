class GetPlanFactory {

  
    public Plan getPlan(Plans planType) {

        if(planType.equals(Plans.DOMESTICPLAN)){
            return new DomesticPlan();
        } else if(planType.equals(Plans.INSTITUTIONALPLAN)) {
            return new InstitutionalPlan();
        } else if (planType.equals(Plans.COMMERCIALPLAN)) {
            return new CommericialPlan();
        }

        return null;
    }
}