package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_ChR_By_Point;
import CC.Util.By.LMNt.Set_ChR_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.ChR$ChR;
import CC.$.Q$Q.Point$ChR;
import CC.$.Q2$.Point_ChR$;
import CC.$.Q2$1.ChR2$1;

public interface Set_ChR_By_Point<By_Typ,From_Typ> extends
	Get_ChR_By_Point<By_Typ>,
	Set_ChR_By_Q<From_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Point_ChR$<By_Typ>
{
	@Lin_Dclar void Set_ChR_By_Point(By_Typ By,char Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_ChR$(By_Typ By,char Valu){Set_ChR_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR_By_Point_Sorc(By_Typ By,Point$ChR<By_Typ> Sorc){Set_ChR_By_Point(By,Sorc.Point$ChR(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR1$1_By_Point(By_Typ By,ChR$ChR Fun,char Valu)
		{Set_ChR_By_Point(By,Fun.ChR$ChR(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR1$1_By_Point_Sorc(By_Typ By,ChR$ChR Fun,Point$ChR<By_Typ> Sorc)
			{Set_ChR1$1_By_Point(By,Fun,Sorc.Point$ChR(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR1$1_By_Point(By_Typ By,ChR$ChR Fun)
				{Set_ChR1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_ChR2$1_By_Point(By_Typ By,ChR2$1 Fun,char A,char B)
		{Set_ChR_By_Point(By,Fun.ChR2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_ChR2$1_By_Point_SLit(By_Typ By,ChR2$1 Fun,Point$ChR<By_Typ> A,char B)
			{Set_ChR2$1_By_Point(By,Fun,A.Point$ChR(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_ChR2$1_By_Point(By_Typ By,ChR2$1 Fun,char B)
				{Set_ChR2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_ChR2$1_By_Point_Sorc(By_Typ By,ChR2$1 Fun,Point$ChR<By_Typ> A,Point$ChR<By_Typ> B)
				{Set_ChR2$1_By_Point_SLit(By,Fun,A,B.Point$ChR(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_ChR2$1_By_Point_Sorc(By_Typ By,ChR2$1 Fun,Point$ChR<By_Typ> B)
					{Set_ChR2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default char SGet_ChR_By_Point(By_Typ By,char Valu)
	{
		char Stor=Get_ChR_By_Point(By);
		Set_ChR_By_Point(By,Valu);

		return Stor;
	}
}