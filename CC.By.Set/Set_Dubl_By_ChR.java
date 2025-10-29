package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_ChR;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_ChR;
import CC.$.Q$Q.ChR$Dubl;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q2$.ChR_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_ChR<From_Typ> extends
	Get_Dubl_By_ChR,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_ChR<From_Typ>,
	ChR_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_ChR(char By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void ChR_Dubl$(char By,double Valu){Set_Dubl_By_ChR(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_ChR_Sorc(char By,ChR$Dubl Sorc){Set_Dubl_By_ChR(By,Sorc.ChR$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_ChR(char By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_ChR(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_ChR_Sorc(char By,Dubl1$1 Fun,ChR$Dubl Sorc)
			{Set_Dubl1$1_By_ChR(By,Fun,Sorc.ChR$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_ChR(char By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_ChR_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_ChR(char By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_ChR(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_ChR_SLit(char By,Dubl2$1 Fun,ChR$Dubl A,double B)
			{Set_Dubl2$1_By_ChR(By,Fun,A.ChR$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_ChR(char By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_ChR_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_ChR_Sorc(char By,Dubl2$1 Fun,ChR$Dubl A,ChR$Dubl B)
				{Set_Dubl2$1_By_ChR_SLit(By,Fun,A,B.ChR$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_ChR_Sorc(char By,Dubl2$1 Fun,ChR$Dubl B)
					{Set_Dubl2$1_By_ChR_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_ChR(char By,double Valu)
	{
		double Stor=Get_Dubl_By_ChR(By);
		Set_Dubl_By_ChR(By,Valu);

		return Stor;
	}
}