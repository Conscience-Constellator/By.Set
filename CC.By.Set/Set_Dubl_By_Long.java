package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Long;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q$Q.Long$Dubl;
import CC.$.Q2$.Long_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Long<From_Typ> extends
	Get_Dubl_By_Long,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Long<From_Typ>,
	Long_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_Long(long By,double Valu);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Long_Sorc(long By,Long$Dubl Sorc){Set_Dubl_By_Long(By,Sorc.Long$Dubl(By));}
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Dubl$(long By,double Valu){Set_Dubl_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Long(long By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Long(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Long_Sorc(long By,Dubl1$1 Fun,Long$Dubl Sorc)
			{Set_Dubl1$1_By_Long(By,Fun,Sorc.Long$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Long(long By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Long(long By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Long(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Long_SLit(long By,Dubl2$1 Fun,Long$Dubl A,double B)
			{Set_Dubl2$1_By_Long(By,Fun,A.Long$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Long(long By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Long_Sorc(long By,Dubl2$1 Fun,Long$Dubl A,Long$Dubl B)
				{Set_Dubl2$1_By_Long_SLit(By,Fun,A,B.Long$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Long_Sorc(long By,Dubl2$1 Fun,Long$Dubl B)
					{Set_Dubl2$1_By_Long_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Long(long By,double Valu)
	{
		double Stor=Get_Dubl_By_Long(By);
		Set_Dubl_By_Long(By,Valu);

		return Stor;
	}
}